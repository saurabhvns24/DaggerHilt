package com.example.hiltandroid

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class)
@Module
 class UserModule {
    //    @Provides
//    fun provideUserRepository(): UserRepository {
//        return FirebaseRepository()
//    }
//    @Binds
//    abstract fun provideUserRepository(sqlRepository: SQLRepository): UserRepository
    //bind interface with class
    @Provides
    @Named("SQL")
    fun provideSQLUserRepository(): UserRepository {
        return SQLRepository()
    }

    @Provides
    @Named("Firebase")
    fun provideFirebaseUserRepository(): UserRepository {
        return FirebaseRepository()
    }
}