Algoritmo IntercambioTarjetas 
		Definir n, pasada, j, i, auxiliar Como Entero
		Definir totalPasadas, totalComparaciones, totalIntercambios Como Entero
		Definir huboIntercambio Como Logico
		//
		n <- 5
		Dimension arreglo[5]
		arreglo[1] <- 34
		arreglo[2] <- 12
		arreglo[3] <- 25
		arreglo[4] <- 8
		arreglo[5] <- 19
		
		totalPasadas <- 0
		totalComparaciones <- 0
		totalIntercambios <- 0
		pasada <- 0
		huboIntercambio <- Verdadero
		
		Escribir Sin Saltar "Original: "
		Para i <- 1 Hasta n Hacer
			Escribir Sin Saltar arreglo[i], " "
		FinPara
		Escribir ""
		
		// Condicion de paro: n-1 pasadas como maximo, o antes si no hubo intercambios
		Mientras pasada < n - 1 Y huboIntercambio Hacer
			pasada <- pasada + 1
			huboIntercambio <- Falso
			
			// Los ultimos (pasada - 1) elementos ya estan en su lugar
			Para j <- 1 Hasta n - pasada Hacer
				totalComparaciones <- totalComparaciones + 1
				Si arreglo[j] > arreglo[j + 1] Entonces
					auxiliar <- arreglo[j]
					arreglo[j] <- arreglo[j + 1]
					arreglo[j + 1] <- auxiliar
					totalIntercambios <- totalIntercambios + 1
					huboIntercambio <- Verdadero
				FinSi
			FinPara
			
			Escribir Sin Saltar "Pasada ", pasada, ": "
			Para i <- 1 Hasta n Hacer
				Escribir Sin Saltar arreglo[i], " "
			FinPara
			Escribir ""
		FinMientras
		
		totalPasadas <- pasada
		Escribir "Total de pasadas: ", totalPasadas
		Escribir "Total de comparaciones: ", totalComparaciones
		Escribir "Total de intercambios: ", totalIntercambios
FinAlgoritmo
