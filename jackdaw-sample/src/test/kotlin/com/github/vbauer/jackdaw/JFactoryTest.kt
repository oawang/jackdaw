package com.github.vbauer.jackdaw

import com.github.vbauer.jackdaw.base.BaseTest
import org.hamcrest.Matchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

/**
 * @author Vladislav Bauer
 */
class JFactoryTest : BaseTest() {

    @Test
    fun testCompanyFactoryConstructor() {
        checkConstructor(CompanyFactory::class)
    }

    @Test
    fun testCompanyFactory() {
        val id = 7
        val listed = true
        val name = "test"
        val revenue = 12L

        val company = CompanyFactory.create(id, name, revenue, listed)

        assertThat(company.id, equalTo(id))
        assertThat(company.name, equalTo(name))
        assertThat(company.revenue, equalTo(revenue))
        assertThat(company.isListed, equalTo(listed))
    }

}