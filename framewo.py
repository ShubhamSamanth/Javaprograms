# Import necessary libraries and frameworks
import flask
from flask import request, jsonify
import sqlite3

# Create the Flask app
app = flask.Flask(__name__)
app.config["DEBUG"] = True

# Define routes for the app
@app.route('/', methods=['GET'])
def home():
    return "<h1>Gold Business App</h1><p>This is a prototype API for a gold business app.</p>"

@app.route('/gold', methods=['GET'])
def gold():
    # Connect to the database
    conn = sqlite3.connect('gold.db')
    cur = conn.cursor()

    # Query the database for the current gold price
    cur.execute("SELECT * FROM gold WHERE id = 1")
    row = cur.fetchone()
    gold_price = row[1]

    # Return the current gold price as JSON
    return jsonify(gold_price)

@app.route('/buy', methods=['POST'])
def buy():
    # Get the user's information from the request
    username = request.json['username']
    password = request.json['password']
    amount = request.json['amount']

    # Check the user's credentials
    if username == 'admin' and password == 'password':
        # Connect to the database
        conn = sqlite3.connect('gold.db')
        cur = conn.cursor()

        # Insert the transaction into the database
        cur.execute("INSERT INTO transactions (username, amount, transaction_type) VALUES (?, ?, ?)", (username, amount, 'buy'))
        conn.commit()

        # Return a success message
        return jsonify({'message': 'Transaction successful.'})
    else:
        # Return an error message
        return jsonify({'message': 'Invalid credentials.'})

# Run the app
if __name__ == '__main__':
    app.run()
