import matplotlib.pyplot as plt
import numpy as np

algoritmo5 = []
mediaComparacoes5 = []

algoritmo10 = []
mediaComparacoes10 = []

algoritmo100 = []
mediaComparacoes100 = []

algoritmo1k = []
mediaComparacoes1k = []

algoritmo10k = []
mediaComparacoes10k = []

espaco = ' '
valueInicial = '0'


dataset = open('T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor5.csv', 'r')

for line in dataset:
    algoritmo5.append(espaco)
    mediaComparacoes5.append(valueInicial)
    line = line.strip()
    X, Y = line.split('|')
    algoritmo5.append(X)  
    mediaComparacoes5.append(Y)

dataset.close()


plt.bar(algoritmo5, mediaComparacoes5)
plt.title('Media comparações em vetores de tamanho 5')
plt.show()



dataset = open('T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor10.csv', 'r')

for line in dataset:
    algoritmo10.append(espaco)
    mediaComparacoes10.append(valueInicial)
    line = line.strip()
    X, Y = line.split('|')
    algoritmo10.append(X)  
    mediaComparacoes10.append(Y)

dataset.close()

plt.bar(algoritmo10, mediaComparacoes10)
plt.title('Media comparações em vetores de tamanho 10')
plt.show()



dataset = open('T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor100.csv', 'r')

for line in dataset:
    algoritmo100.append(espaco)
    mediaComparacoes100.append(valueInicial)
    line = line.strip()
    X, Y = line.split('|')
    algoritmo100.append(X)  
    mediaComparacoes100.append(Y)

dataset.close()

plt.bar(algoritmo100, mediaComparacoes100)
plt.title('Media comparações em vetores de tamanho 100')
plt.show()




dataset = open('T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor1000.csv', 'r')

for line in dataset:
    algoritmo1k.append(espaco)
    mediaComparacoes1k.append(valueInicial)
    line = line.strip()
    X, Y = line.split('|')
    algoritmo1k.append(X)  
    mediaComparacoes1k.append(Y)

dataset.close()

plt.bar(algoritmo1k, mediaComparacoes1k)
plt.title('Media comparações em vetores de tamanho 1000')
plt.show()




dataset = open('T:\\UAM\\Pesquisa Ordenacao e Tecnica\\POTA_APS\\zmdVetor10000.csv', 'r')

for line in dataset:
    algoritmo10k.append(espaco)
    mediaComparacoes10k.append(valueInicial)
    line = line.strip()
    X, Y = line.split('|')
    algoritmo10k.append(X)  
    mediaComparacoes10k.append(Y)

dataset.close()

plt.bar(algoritmo10k, mediaComparacoes10k)
plt.title('Media comparações em vetores de tamanho 10000')
plt.show()


