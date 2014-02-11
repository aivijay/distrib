package distrib

class UserController {
	def login() {

	}
	def handleLogin() {
		def user = User.findByUserName(params.userName)
		if (!user) {
			flash.message = "User not found for userName: ${params.userName}"
			redirect(action:'login')
			return
		} else {
			session.user = user
			redirect(controller:'distrib')
		}
	}

	def logout() {
		if(session.user) {
			session.user = null
			redirect(action:'login')
		}
	}
}
