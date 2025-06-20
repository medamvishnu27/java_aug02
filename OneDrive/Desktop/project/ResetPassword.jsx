import { useState, useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { Link, useNavigate, useLocation } from 'react-router-dom';
import { useForm } from 'react-hook-form';
import { motion } from 'framer-motion';
import { resetPassword, clearError } from './Institue_internship_v0/src/redux/slices/authSlice';
import { FiLock } from 'react-icons/fi';
import { toast } from 'react-toastify';
import bg3 from '/bg-3.png';

const ResetPassword = () => {
  const { register, handleSubmit, formState: { errors } } = useForm();
  const dispatch = useDispatch();
  const navigate = useNavigate();
  const location = useLocation();
  const { loading, error } = useSelector((state) => state.auth);

  // Extract access_token and error parameters from URL
  const hashParams = new URLSearchParams(location.hash.substring(1));
  const searchParams = new URLSearchParams(location.search);
  const accessToken = hashParams.get('access_token') || searchParams.get('access_token');
  const errorCode = hashParams.get('error_code') || searchParams.get('error_code');
  const errorDescription = hashParams.get('error_description') || searchParams.get('error_description');

  useEffect(() => {
    const clickTimestamp = new Date().toISOString();
    console.log('Link clicked at:', clickTimestamp);
    console.log('Full URL:', window.location.href);
    console.log('location:', location);
    console.log('location.hash:', location.hash);
    console.log('location.search:', location.search);
    console.log('accessToken:', accessToken);
    console.log('errorCode:', errorCode);
    console.log('errorDescription:', errorDescription);

    if (!accessToken) {
      console.log('No access token found, checking for errors...');
      let errorMessage;
      if (errorCode === 'otp_expired') {
        errorMessage = 'The password reset link has expired. Please request a new one.';
      } else if (errorCode === 'access_denied') {
        errorMessage = 'Access denied. The reset link is invalid or has already been used.';
      } else if (errorDescription) {
        errorMessage = errorDescription;
      } else {
        errorMessage = 'Invalid or expired reset link. No parameters found in the URL. Please request a new one.';
      }

      toast.error(errorMessage, {
        position: "top-right",
        autoClose: 5000,
        hideProgressBar: false,
        closeOnClick: true,
        pauseOnHover: true,
        draggable: true,
        progress: undefined,
      });
      navigate('/login');
    }

    if (error) {
      toast.error(error, {
        position: "top-right",
        autoClose: 5000,
        hideProgressBar: false,
        closeOnClick: true,
        pauseOnHover: true,
        draggable: true,
        progress: undefined,
      });
    }
  }, [accessToken, errorCode, errorDescription, navigate, error]);

  const onSubmit = async (data) => {
    dispatch(clearError());
    try {
      await dispatch(resetPassword({ accessToken, password: data.password })).unwrap();
      toast.success('Password reset successfully! Redirecting to login...', {
        position: "top-right",
        autoClose: 2000,
        hideProgressBar: false,
        closeOnClick: true,
        pauseOnHover: true,
        draggable: true,
        progress: undefined,
      });
      setTimeout(() => {
        navigate('/login');
      }, 2000);
    } catch (err) {
      console.error('Password reset failed:', err);
    }
  };

  return (
    <div className="min-h-screen bg-black bg-no-repeat bg-cover bg-center flex items-center justify-center px-4 sm:px-6 lg:px-8" style={{ backgroundImage: `url(${bg3})` }}>
      <motion.div 
        className="max-w-md w-full bg-white rounded-lg shadow-xl overflow-hidden"
        initial={{ opacity: 0, y: 20 }}
        animate={{ opacity: 1, y: 0 }}
        transition={{ duration: 0.5 }}
      >
        <div className="px-6 py-8 sm:p-10">
          <div className="text-center">
            <h2 className="text-3xl font-extrabold text-gray-900">Reset Password</h2>
            <p className="mt-2 text-sm text-gray-600">
              Enter your new password
            </p>
          </div>

          <form className="mt-8 space-y-6" onSubmit={handleSubmit(onSubmit)}>
            <div>
              <label htmlFor="password" className="block text-sm font-medium text-gray-700">
                New Password
              </label>
              <div className="mt-1 relative">
                <div className="absolute inset-y-0 left-0 pl-3 flex items-center pointer-events-none">
                  <FiLock className="h-5 w-5 text-gray-400" />
                </div>
                <input
                  id="password"
                  type="password"
                  autoComplete="new-password"
                  {...register('password', { 
                    required: 'Password is required',
                    minLength: {
                      value: 6,
                      message: 'Password must be at least 6 characters'
                    }
                  })}
                  className="input-field pl-10"
                  placeholder="••••••••"
                />
              </div>
              {errors.password && (
                <p className="mt-1 text-sm text-red-600">{errors.password.message}</p>
              )}
            </div>

            <div>
              <button
                type="submit"
                disabled={loading}
                className="w-full btn-primary py-3 flex justify-center items-center"
              >
                {loading ? (
                  <svg className="animate-spin -ml-1 mr-3 h-5 w-5 text-white" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24">
                    <circle className="opacity-25" cx="12" cy="12" r="10" stroke="currentColor" strokeWidth="4"></circle>
                    <path className="opacity-75" fill="currentColor" d="M4 12a8 8 0 018-8V0C5.373 0 0 5.373 0 12h4zm2 5.291A7.962 7.962 0 014 12H0c0 3.042 1.135 5.824 3 7.938l3-2.647z"></path>
                  </svg>
                ) : null}
                {loading ? 'Resetting...' : 'Reset Password'}
              </button>
            </div>
          </form>

          <div className="mt-6 text-center">
            <p className="text-sm text-gray-600">
              Remember your password?{' '}
              <Link to="/login" className="font-medium text-primary-600 hover:text-primary-500">
                Sign in
              </Link>
            </p>
          </div>
        </div>
      </motion.div>
    </div>
  );
};

export default ResetPassword;