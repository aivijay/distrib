package distrib

class MessageController {

    def index() { 
		log.debug "Message being sent by producer"
		sendMessage
		log.debug "Message successfully sent"
		render "Message Index"
	}
	
	def sendMessage = {
		refQueue = 'msgs'
		message = 'initial message'
		rabbitSend refQueue, message
	}
}
