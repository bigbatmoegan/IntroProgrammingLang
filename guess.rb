answer=rand(10)

print "Guess a number between 0 and 9: "
guess=gets.chomp.to_i

until guess==answer
	puts "guess again"
	guess=gets.chomp.to_i
end

print "You got it" 