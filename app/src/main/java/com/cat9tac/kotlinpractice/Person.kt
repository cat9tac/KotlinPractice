package com.cat9tac.kotlinpractice

/**
 *  createtime: 2019/5/24
 *  author:  jessica
 *  fuction: a class about person
 */
class Person{
    var name :String = ""
    get() = field.toUpperCase()
    set(value) {
        field = "Name = $value"
    }

}

