while True:
    print("Hallo")

    stop = ["t", "no", "T"]

    answer = input("Apakah mau lanjut (y/t)?")

    if answer in stop:
        print("Program berhenti")
        break