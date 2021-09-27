from matplotlib import scale
import matplotlib.pyplot as plt
import numpy as np
from matplotlib.pyplot import figure

x5 = []
y5 = []

x10 = []
y10 = []

x100 = []
y100 = []

x1k = []
y1k = []

x10k = []
y10k = []


#Gera resultado vetores de tamanho 5
dataset = open('T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor5.csv', 'r')

for line in dataset:

    line = line.strip()
    X, Y = line.split('|')
    Y = float(Y.replace(',', '.'))
    x5.append(X)
    y5.append(Y)
    
dataset.close()

figure(figsize=(8, 6), dpi=80)
plt.bar(x5, y5)
plt.title('resultado em vetores de tamanho 5')
plt.xlabel('Algoritmos')
plt.ylabel('Numero de Comparações')
plt.show()


#Gera resultado vetores de tamanho 10
dataset = open('T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor10.csv', 'r')

for line in dataset:

    line = line.strip()
    X, Y = line.split('|')
    Y = float(Y.replace(',', '.'))
    x10.append(X)
    y10.append(Y)
    
dataset.close()

figure(figsize=(8, 6), dpi=80)
plt.bar(x10, y10)
plt.title('resultado em vetores de tamanho 10')
plt.xlabel('Algoritmos')
plt.ylabel('Numero de Comparações')
plt.show()


#Gera resultado vetores de tamanho 100
dataset = open('T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor100.csv', 'r')

for line in dataset:

    line = line.strip()
    X, Y = line.split('|')
    Y = float(Y.replace(',', '.'))
    x100.append(X)
    y100.append(Y)
    
dataset.close()

figure(figsize=(8, 6), dpi=80)
plt.bar(x100, y100)
plt.title('resultado em vetores de tamanho 100')
plt.xlabel('Algoritmos')
plt.ylabel('Numero de Comparações')
plt.show()



#Gera resultado vetores de tamanho 1000
dataset = open('T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor1000.csv', 'r')

for line in dataset:

    line = line.strip()
    X, Y = line.split('|')
    Y = float(Y.replace(',', '.'))
    x1k.append(X)
    y1k.append(Y)
    
dataset.close()

figure(figsize=(8, 6), dpi=80)
plt.bar(x1k, y1k)
plt.title('resultado em vetores de tamanho 1000')
plt.xlabel('Algoritmos')
plt.ylabel('Numero de Comparações')
plt.show()

#Gera resultado vetores de tamanho 10000
dataset = open('T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor10000.csv', 'r')

for line in dataset:

    line = line.strip()
    X, Y = line.split('|')
    Y = float(Y.replace(',', '.'))
    x10k.append(X)
    y10k.append(Y)
    
dataset.close()


figure(figsize=(8, 6), dpi=80)
plt.bar(x10k, y10k)
plt.title('resultado em vetores de tamanho 10000')
plt.xlabel('Algoritmos')
plt.ylabel('Numero de Comparações')
plt.show()