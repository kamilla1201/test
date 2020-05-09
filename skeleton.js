const questions = [
    "what are the advantages of rust over c++?",
    "what is the distance between Omaha and Portland?",
    "negative index in python",
    "When is Thanksgiving Day 2020?",
    "what is yml?",
    "10 gallons in liters"
]

async function get_answer_from_qa_api(question) {
	// Get the answer from Quick Answers API
}

async function get_answer_from_ms_api(question) {
		// Get the answer from Microsoft Project Answer Search API
}

async function print_qa_results() {
	console.log("Part 1. Getting results from Quick Answers API");
	console.log("----------------------------------");
	for (let i = 0; i < questions.length; i++) {
		let question = questions[i];
	    console.log("Question: " + question);
	    console.log("----------------------------------");
		console.log(await get_answer_from_qa_api(question))
	    console.log("----------------------------------");
	}
}

async function print_ms_results() {
	console.log("Part 2. Getting results from Microsoft Project Answer Search API");
	console.log("----------------------------------");
	for (let i = 0; i < questions.length; i++) {
		let question = questions[i];
	    console.log("Question: " + question);
	    console.log("----------------------------------");
		console.log(await get_answer_from_ms_api(question))
	    console.log("----------------------------------");
	}
}

print_qa_results().then(() => {
	print_ms_results();
});
