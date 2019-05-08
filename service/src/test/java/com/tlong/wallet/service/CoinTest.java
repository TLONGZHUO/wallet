package com.tlong.wallet.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @Auther: wangzhuo
 * @Date: 2019-04-24 16:40
 * @Description:
 */
public class CoinTest extends ServiceApplicationTests{

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCoinFindOne() throws Exception {
        long id = 1L;
        mockMvc.perform(MockMvcRequestBuilders.post("/api/coin/findOne/" + id)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.detail").value("哈哈"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value("1"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

}
