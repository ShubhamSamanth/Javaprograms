import React, { useState, useEffect } from 'react';

function App() {
  const [goldPrice, setGoldPrice] = useState(null);
  const [buyAmount, setBuyAmount] = useState(0);
  const [sellAmount, setSellAmount] = useState(0);
  const [transactions, setTransactions] = useState([]);

  useEffect(() => {
    fetchGoldPrice();
    fetchTransactions();
  }, []);

  const fetchGoldPrice = async () => {
    const response = await fetch('/api/gold');
    const data = await response.json();
    setGoldPrice(data.price);
  };

  const fetchTransactions = async () => {
    const response = await fetch('/api/transactions');
    const data = await response.json();
    setTransactions(data.transactions);
  };

  const buyGold = async () => {
    const response = await fetch('/api/buy', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ amount: buyAmount })
    });
    const data = await response.json();
    console.log(data);
    fetchGoldPrice();
    fetchTransactions();
  };

  const sellGold = async () => {
    const response = await fetch('/api/sell', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ amount: sellAmount })
    });
    const data = await response.json();
    console.log(data);
    fetchGoldPrice();
    fetchTransactions();
  };

  return (
    <div>
      <h1>Gold Business App</h1>
      <p>Current Gold Price: {goldPrice ? `$${goldPrice}` : 'Loading...'}</p>
      <div>
        <h2>Buy Gold</h2>
        <input type="number" value={buyAmount} onChange={(e) => setBuyAmount(e.target.value)} />
        <button onClick={buyGold}>Buy</button>
      </div>
      <div>
        <h2>Sell Gold</h2>
        <input type="number" value={sellAmount} onChange={(e) => setSellAmount(e.target.value)} />
        <button onClick={sellGold}>Sell</button>
      </div>
      <div>
        <h2>Transaction History</h2>
        <table>
          <thead>
            <tr>
              <th>Date</th>
              <th>Type</th>
              <th>Amount</th>
            </tr>
          </thead>
          <tbody>
            {transactions.map((transaction) => (
              <tr key={transaction.id}>
                <td>{transaction.date}</td>
                <td>{transaction.type}</td>
                <td>{`$${transaction.amount}`}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default App;
