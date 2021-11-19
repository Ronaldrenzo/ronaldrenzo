def NotaFinalRRID():
  print("*****Calcular promedio final*****")
  #Datos de entrada
  nota1=float(input("ingrese nota 1:"))
  nota2=float(input("ingrese nota 2:"))
  nota3=float(input("ingrese nota 3:"))
  nota4=float(input("ingrese nota 4:"))
  #Proceso
  promedioFin=(nota1*0.25)+(nota2*0.25)+(nota3*0.25)+(nota4*0.25)
  #Datos de salida
  print(f"su promedio final es: {round(promedioFin,2)}")

NotaFinalRRID()