import java.lang.IllegalArgumentException
import java.util.*

data class Todo(val finished: Boolean, val description: String)
typealias Model = HashMap<UUID, Todo>

sealed class Event {
  class Add(val id: UUID, val description: String) : Event()
  class Finish(val id: UUID) : Event()
  class GiveUp(val id: UUID) : Event()
}

fun newId() = UUID.randomUUID()

fun render(model: Model) {
  if (model.isEmpty()) {
    throw IllegalArgumentException()
  }

  model.map { todo -> println(todo) }
}

fun update(event: Event, model: Model): Model {
  if (event is Event.Add) model[newId()] = Todo(false, event.description)
  else if (event is Event.Finish) {
    model[event.id]?.let {
      model[event.id] = it.copy(finished = true)
    }
  } else if (event is Event.GiveUp) model.remove(event.id)

  return model
}

fun main(args: Array<String>) {
  var model = Model()

  model = update(Event.Add(newId(), "update should use when()"), model)
  model = update(Event.Add(newId(), "render should use require()"), model)
  model = update(Event.Add(newId(), "render should use a shorter reference to println"), model)

  val finished_id = newId()
  model = update(Event.Add(finished_id, "you finished this one already"), model)

  val done_id = newId()
  model = update(Event.Add(done_id, "this never gets done"), model)

  model = update(Event.Finish(finished_id), model)
  model = update(Event.GiveUp(done_id), model)
  render(model)
}
