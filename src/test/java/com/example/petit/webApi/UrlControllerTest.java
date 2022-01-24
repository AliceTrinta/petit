package com.example.petit.webApi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = UrlController.class)
public class UrlControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UrlController urlController;

    @Test
    public void Given_ARandomUrl_When_CallingCreateShortUrl_Then_Return200() throws Exception {
        //Arrange
        var url = "google.com";

        //Act
        var result = mockMvc.perform(post("/short")
                        .param("url", url));
        //Assert
        result.andExpect(status().isOk());
    }
}
