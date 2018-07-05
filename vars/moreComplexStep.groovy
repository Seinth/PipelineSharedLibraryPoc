def call(Map config) {
	node {
		git url: "https://github.com/${config.name}/${config.project}.git"
	}
}

