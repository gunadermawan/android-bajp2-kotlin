package com.gunder.film.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.gunder.film.data.source.remote.RemoteDataSource
import org.junit.Rule
import org.mockito.Mockito.*

import org.junit.Test

class FilmRepositoryTest {
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()
    private val remote = mock(RemoteDataSource::class.java)

    @Test
    fun getAllMovies() {
    }

    @Test
    fun getAllTvShow() {
    }

    @Test
    fun getDetailMovies() {
    }

    @Test
    fun getDetailTvShow() {
    }
}