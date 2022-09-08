package com.example.spaceapp.data.repository

import com.example.spaceapp.data.local.SpaceDAO
import com.example.spaceapp.data.remote.SpaceRemoteDataSource
import com.example.spaceapp.utils.performGetOperation
import javax.inject.Inject

class SpaceRepository @Inject constructor(
    private val remoteDataSource: SpaceRemoteDataSource,
    private val localDataSource: SpaceDAO

){
    fun getSpace() = performGetOperation(
        databaseQuery = {localDataSource.getAllSpace()},
        networkCall = {remoteDataSource.getSpace()},
        saveCallResult = {localDataSource.insertAll(it)}
    )
}