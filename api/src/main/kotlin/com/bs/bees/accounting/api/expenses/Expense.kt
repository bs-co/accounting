package com.bs.bees.accounting.api.expenses

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.awt.Label

@Document
class Expense constructor(@Id val id: String, var label: Label){


}