#Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 2D пространстве. 
#Пример: 
#- A (3,6); B (2,1) -> 5,09 
#- A (7,-5); B (1,-1) -> 7,21 
import math 
 
x = int(input('Введите число a1 ')) 
y = int(input('Введите число a2 ')) 
x1 = int(input('Введите число b1 ')) 
y1 = int(input('Введите число b2 ')) 
 
distance = math.sqrt(( x1 - x)**2 + (y1 - y)**2) 
distance = int(distance * 100) 
distance = float(distance/100) 
print(distance)