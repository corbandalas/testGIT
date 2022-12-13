package com.corbandalas.InvokeService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NASAClientImplTest {

    @Test
    public void testNasaCLient() {

        var nasaClient = new NASAClientImpl();

        assertThrows(NullPointerException.class, ()-> nasaClient.getPictures(null));
    }

}