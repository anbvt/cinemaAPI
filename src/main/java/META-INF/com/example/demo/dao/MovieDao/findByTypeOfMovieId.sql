SELECT movie.id,
    movie.poster
FROM movie 
LEFT JOIN moviedetails ON movie.id = moviedetails.movieid
JOIN movieconfig ON movie.id = movieconfig.movieid
WHERE moviedetails.typeofmovieid IN /* typeofmovieid */('LP01','LP02')
GROUP BY movie.id, movie.poster
LIMIT 10