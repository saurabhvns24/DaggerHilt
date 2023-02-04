package com.example.hiltandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainFragment : Fragment() {
    @Inject
    @Named("Firebase")
    lateinit var userRepository: UserRepository
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        userRepository.saveUser("saurabh", "saurabh@123")
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}