package com.example.tokokekdia.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tokokekdia.R
import com.example.tokokekdia.core.data.source.remote.request.LoginRequest
import com.example.tokokekdia.databinding.ActivityLoginBinding
import com.example.tokokekdia.databinding.FragmentDashboardBinding
import com.example.tokokekdia.util.Prefs
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {
    private val viewModel : LoginViewModel by viewModel()
    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setData()
    }

        private fun setData() {
            viewModel.text.observe(this, {
                binding.edtEmail.setText(it)
            })

            binding.btnMasuk.setOnClickListener(){

                val body = LoginRequest(
                    binding.edtEmail.text.toString(),
                    binding.edtPassword.text.toString()
                )
                viewModel.login(body).observe(this,{

                })
            }

        }
    }

