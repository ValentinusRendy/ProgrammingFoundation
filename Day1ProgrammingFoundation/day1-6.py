huruf = input("Masukkan sebuah huruf: ")

vokal = ["a", "i", "u", "e", "o"]

if huruf in vokal:
    print(huruf, "adalah vokal")
else:
    print(huruf, "adalah konsonan")