package com.njagi.application.transformer

interface Transformer<A,B> {
    fun transform(source:A) :B
}

