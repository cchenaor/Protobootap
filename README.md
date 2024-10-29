GitHub Actions:
![image](https://github.com/user-attachments/assets/1b6417cd-69e7-4042-9635-e0b7a28efdac)
Para la practica de GitHub actions, estuve haciendo pruebas, funcionaron correctamente, y luego incluí pruebas unitarias en el maven.yml y tambien se procesaron correctamente cómo se ve a continuación
![image](https://github.com/user-attachments/assets/5a4dc481-8039-414a-9293-8e9ee3c31934)
Cuando hice las prubas unitarias y me funcionaron bien, opté por hacer daños en el codigo para ver cómo se reflejaban en GitHub Actions, efectivamente fallaron las pruebas
Una vez lo volví a arreglar, vi que hice daños y no volvió a procesar correctamente el Build ni las pruebas

Jenkins: 
Para las pruebas con Jenkins, inicialmente tuve muchos inconvenientes y no podía hacer el commit correctamente, como se muestra a continuación:
![image](https://github.com/user-attachments/assets/ce66de0a-1c2d-4229-bae4-5ac8a69a4aee)
Al parecer el problema siempre estuvo relacionado con la configuración del Maven, una vez pude realizar la configuración del maven correctamente, y organizar el archivo Pom.xml ya pude hacer el commit correctamente cómo se muestra a continuación:
![image](https://github.com/user-attachments/assets/21e8d9bf-2ae5-4e27-a1c6-21e9501e8db3)
Para la practica de AWS:
No pude realizar pruebas correctamente ya que la opcion de Correto17 no me aparece disponible en imagen, cómo se muestra a continuación:
![image](https://github.com/user-attachments/assets/7b795510-c7b9-4812-bb28-8bba07f85407)
Al rejecutar los pipelines salían erroneos como se muestra:
![image](https://github.com/user-attachments/assets/60ed508f-ed0d-45de-8e53-d7d3f379cf1e)
Y registra que el error es debido a que no está configurado el correto17, se detalla a continuación:
![image](https://github.com/user-attachments/assets/8f6b03bd-7105-4e08-bd30-50dd7201726e)
Muchas gracias!
