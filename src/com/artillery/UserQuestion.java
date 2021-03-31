package com.artillery;

public interface UserQuestion<T> { //want to describe general idea where we get user input and parse ShipOrienting and AskShip
    T userInput(); // could return either shiptype or shiporientation so we need to get generic
}

//generics are a way of writing a class or interface such that you don't commit to either type until such a time that said entity is used
// T is most common abbreviation meaning type, second most is U
// <> contains all the types you'd liek to make generic