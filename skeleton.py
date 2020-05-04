questions = [
    "what are the advantages of rust over c++?",
    "what is the distance between Omaha and Portland?",
    "negative index in python",
    "When is Thanksgiving Day 2020?",
    "what is yml?",
    "10 gallons in liters"
]

def get_answer_from_qa_api(question):
    pass

def get_answer_from_ms_api(question):
    pass


for question in questions:
    print("----------------------------------")
    print("Getting results from MS API")
    print("----------------------------------")
    print("Question: " + question)
    print("----------------------------------")
    print(get_answer_from_ms_api(question))
    print("----------------------------------")

for question in questions:
    print("----------------------------------")
    print("Getting results from Quick Answers API")
    print("----------------------------------")
    print("Question: " + question)
    print("----------------------------------")
    print(get_answer_from_ms_api(question))
    print("----------------------------------")
