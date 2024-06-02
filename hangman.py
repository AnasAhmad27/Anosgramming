import random

def hangman():
    words = ['python', 'java', 'ruby', 'javascript', 'html', 'css']
    word = random.choice(words)
    guessed_letters = []
    tries = 6

    while tries > 0:
        word_completion = ''
        for letter in word:
            if letter in guessed_letters:
                word_completion += letter
            else:
                word_completion += '_'
        print(word_completion)
        
        if word_completion == word:
            print("Congratulations! You guessed the word correctly!")
            break
        
        guess = input("Guess a letter: ").lower()
        guessed_letters.append(guess)
        
        if guess not in word:
            tries -= 1
            print(f"Wrong guess! You have {tries} tries left.")
    else:
        print("Sorry, you ran out of tries. The word was:", word)

hangman()
