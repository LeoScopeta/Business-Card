package com.example.businesscard.data

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class BusinessCardRepository(private val dao: BusinessCardDao) {
    fun insert(businessCard: BusinessCard) = runBlocking {
        launch {
            dao.insert(businessCard)
        }
    }
    fun getAll() = dao.getAll()
}