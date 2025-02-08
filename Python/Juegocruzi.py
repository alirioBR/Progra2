import tkinter as tk
import random

# Configuración del crucigrama
size = 10  # Tamaño del tablero 10x10
grid = [[' ' for _ in range(size)] for _ in range(size)]
solution = [[' ' for _ in range(size)] for _ in range(size)]  # Solución correcta
words = ["PYTHON", "CODE", "GAME", "DEBUG", "SCRIPT"]

# Función para colocar una palabra horizontalmente
def place_word_horizontal(word, row, col):
    if col + len(word) > size:  # Verifica que la palabra quepa
        return False
    for i in range(len(word)):
        grid[row][col + i] = "_"
        solution[row][col + i] = word[i]  # Guarda la solución
    return True

# Función para colocar una palabra verticalmente
def place_word_vertical(word, row, col):
    if row + len(word) > size:  # Verifica que la palabra quepa
        return False
    for i in range(len(word)):
        grid[row + i][col] = "_"
        solution[row + i][col] = word[i]  # Guarda la solución
    return True

# Insertar palabras en la cuadrícula
for word in words:
    placed = False
    while not placed:
        direction = random.choice(["H", "V"])
        row = random.randint(0, size - 1)
        col = random.randint(0, size - 1)

        if direction == "H":
            placed = place_word_horizontal(word, row, col)
        else:
            placed = place_word_vertical(word, row, col)

# Crear la ventana con Tkinter
root = tk.Tk()
root.title("Crucigrama Interactivo")

# Diccionario para almacenar los cuadros de entrada (Entry)
entries = {}

# Función para verificar si el usuario ha completado correctamente el crucigrama
def check_solution():
    for r in range(size):
        for c in range(size):
            if grid[r][c] == "_":  # Solo revisar donde había letras ocultas
                user_input = entries[(r, c)].get().upper()
                if user_input != solution[r][c]:  # Comparar con la solución correcta
                    status_label.config(text="❌ Hay errores, intenta de nuevo.", fg="red")
                    return
    status_label.config(text="✅ ¡Felicidades! Completaste el crucigrama.", fg="green")

# Función para mostrar la solución en el crucigrama
def show_solution():
    for r in range(size):
        for c in range(size):
            if grid[r][c] == "_":
                entries[(r, c)].delete(0, tk.END)  # Limpiar la entrada
                entries[(r, c)].insert(0, solution[r][c])  # Mostrar la solución
    status_label.config(text="🔍 Se ha mostrado la solución.", fg="blue")

# Crear la cuadrícula de entradas
for r in range(size):
    for c in range(size):
        if grid[r][c] == "_":  # Si es un espacio donde debe ir una letra
            entry = tk.Entry(root, width=3, font=("Arial", 14), justify="center")
            entry.grid(row=r, column=c, padx=2, pady=2)
            entries[(r, c)] = entry  # Guardar la referencia del Entry
        else:
            label = tk.Label(root, text=" ", width=3, height=1, font=("Arial", 14), bg="lightgray")
            label.grid(row=r, column=c, padx=2, pady=2)

# Botón para verificar respuestas
check_button = tk.Button(root, text="Verificar", command=check_solution, font=("Arial", 12))
check_button.grid(row=size, column=0, columnspan=size//2, pady=10)

# Botón para mostrar la solución
solution_button = tk.Button(root, text="Mostrar Solución", command=show_solution, font=("Arial", 12))
solution_button.grid(row=size, column=size//2, columnspan=size//2, pady=10)

# Etiqueta de estado
status_label = tk.Label(root, text="Introduce las letras y presiona 'Verificar'", font=("Arial", 12))
status_label.grid(row=size + 1, column=0, columnspan=size, pady=5)

# Ejecutar la ventana
root.mainloop()
