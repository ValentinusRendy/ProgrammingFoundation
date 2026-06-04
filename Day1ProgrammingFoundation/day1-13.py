file = open("test2.txt", "r")

content = file.read()

print(content)

file.close()

# cara lebih singkat

with open("test2.txt", "w") as file:
    file.write("halo\n")
    file.write("oke\n")
print("File berhasil dibuat")

with open("test2.txt", "a") as file:
    file.write("halo\n")
    file.write("oke\n")
print("File berhasil ditambahkan")