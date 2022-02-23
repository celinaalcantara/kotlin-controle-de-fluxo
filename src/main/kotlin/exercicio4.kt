import kotlin.math.pow
import kotlin.math.sqrt

fun main(){

    //Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
    // Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

    print("Digite um número: ")
    var num = readLine()!!.toDouble()

    if (num % 2 == 0.0){

    var raiz = sqrt(num)

    println("A raiz quadrada de $num é: ${sqrt(num)}")

    }else
        println("$num elevado ao quadrado é igual a: ${num * num}")

}