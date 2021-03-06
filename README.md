# BCRYPT
- jBCrypt is a Java implementation of OpenBSD's Blowfish Password hashing code, as described in "http://www.openbsd.org/papers/bcrypt-paper.ps" by Niels Provos and David Mazieres.
- more info: [JBCRYPT - Website](https://www.mindrot.org/projects/jBCrypt/)
****
## Contributors:
****
- zaratr - Raul Zarate
****
## Port Instructions 
1. Clone
2. Run ./gradlew run --<args>
3. The app will allow you to create an account and conitnues with website using jBCrypt!
****
## Resources
- [Application properties](lib/src/main/resources/application.properties)
- [JBCRYPT - Website](https://www.mindrot.org/projects/jBCrypt/)
- [seattle-code-java-401d14](https://github.com/codefellows/seattle-code-java-401d14)
****
### Feature Tasks - (14) start a app
- Create a database.
- Create a table that models users with a username, id, and hashed password.
- Create a table that models posts with a postId, userId and text content.
- Create a table with a 1-to-many relationship between users and posts.
- Authenticate the site so only logged-in users can see posts.
- Use Bcrypt to hash all passwords stored on the site.

Time spent: 1 hours
Actual time spent: 3
****

### Feature Tasks - (16) using bcrypt 
- The site should have a login page
- An ApplicationUser should have a username, password (will be hashed using BCrypt), firstName, lastName, dateOfBirth, bio, and any other fields you think are useful.
- The site should allow users to create an ApplicationUser on the “sign up” page.
## Contribution
- Jason Wilson - https://github.com/WilsonJhub/codefellowship/pull/9
- https://github.com/WilsonJhub/codefellowship/pull/13
- Time spent: 3 hours
- Actual time spent: 5
****

### Feature Tasks - (17) allow ManyToMany relationship
- Allow users to log in to CodeFellowship, view user profiles, and create posts.
##Contributors
Jason Wilson - https://github.com/WilsonJhub/codefellowship/pull/9
- https://github.com/WilsonJhub/codefellowship/pull/13
- Time Spent: 3 hours
- Actual Time spent: 5 hours

### Feature Tasks - (18 - Optional)
- Ensure that users can’t perform SQL injection or HTML injection with their posts.
- Allow users to follow other users. Following a user means that their posts show up in the logged-in user’s feed, where they can see what all of their followed users have posted recently.
### Contributors