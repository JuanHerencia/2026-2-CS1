import matplotlib.pyplot as plt
import numpy as np
from math import sin

def balistica( x ):
    return  - x*x - 4*x - 4;

def cubica ( x ):
    return x*x*x - 5*x*x

def sismo( x ):
    return sin(x) / x

def graficar( fun_graf, msj ):
    x = np.arange(-10, 10, 0.1)
    y = []
    for xd in x:
        y.append(fun_graf(xd))
    y = np.array(y)
    plt.plot(x,y)
    plt.title(msj)
    plt.show()
    '''
    for i in range(0,11):
        print(fun_graf(i/10))
    '''
# -----------------------

graficar(balistica, "Grafico de balistica") # graficando balistica
graficar(cubica, "Grafico de cúbica")    # graficando cúbica
graficar(sismo, "Grafico del sismo")