package com.bs.bees.accounting.api.expenses

import org.springframework.data.mongodb.repository.MongoRepository

interface ExpenseRepository: MongoRepository<Expense,String> {

}