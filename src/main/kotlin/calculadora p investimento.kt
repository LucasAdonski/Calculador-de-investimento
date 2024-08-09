import java.text.NumberFormat
import java.util.Locale

fun main() {
    // Entrada de dados
    print("Informe o capital inicial (P): ")
    val principal = readLine()!!.toDouble()

    print("Informe a taxa de juros anual (r) em decimal (ex: 0.05 para 5%): ")
    val rate = readLine()!!.toDouble()

    print("Informe o número de vezes que os juros são aplicados por ano (n): ")
    val timesCompounded = readLine()!!.toInt()

    print("Informe o tempo em anos (t): ")
    val time = readLine()!!.toDouble()

    // Cálculo de juros compostos
    val amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * time)

    // Formatando o valor com separação de milhar
    val formattedAmount = NumberFormat.getNumberInstance(Locale("pt", "BR")).apply {
        minimumFractionDigits = 2
        maximumFractionDigits = 2
    }.format(amount)

    // Exibir o resultado formatado
    println("O valor acumulado após $time anos é: $formattedAmount")
}
