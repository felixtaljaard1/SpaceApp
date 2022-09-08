package com.example.spaceapp.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.spaceapp.data.entities.ResultSpaceItem


@Dao
interface SpaceDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(result: List<ResultSpaceItem>)

    @Query("SELECT * FROM Space_Items")
    fun getAllSpace() : LiveData<List<ResultSpaceItem>>
}