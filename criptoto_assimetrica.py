from os import system

chaves = [2, 3, 5, 7, 11]
alfabeto = [' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']


def criptografar(msg):
    i = 0
    for letra in msg:
        indexLetra = alfabeto.index(letra) + chaves[i % 5]
        print(alfabeto[indexLetra], end=" ")
        i += 1


criptografar("ola mundo")
