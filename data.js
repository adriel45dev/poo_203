const planters = [
        { name: "Alice", treesPlanted: 5000 },
        { name: "Bob", treesPlanted: 4500 },
        { name: "Carol", treesPlanted: 3500 },
        { name: "David", treesPlanted: 2000 },
      ];

      function displayLeaderboard() {
        const leaderboardList = document.getElementById("leaderboardList");
        leaderboardList.innerHTML = "";

        planters.sort((a, b) => b.treesPlanted - a.treesPlanted);

        planters.forEach((planter, index) => {
          const item = `<li class="border border-gray-200 rounded-md p-4 flex items-center justify-between">
                <div class="flex items-center">
                  <span class="text-2xl font-bold text-green-600 mr-4">${
                    index + 1
                  }</span>
                  <div>
                    <p class="text-xl">${planter.name}</p>
                    <p class="text-gray-500">${planter.treesPlanted} pontos</p>
                  </div>
                </div>
                <span class="text-2xl font-bold">${planter.treesPlanted}</span>
              </li>`;

          leaderboardList.innerHTML += item;
        });
      }

      displayLeaderboard();
