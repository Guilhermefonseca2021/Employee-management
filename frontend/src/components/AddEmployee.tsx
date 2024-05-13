export default function AddEmployee() {
  return (
    <div className="flex max-w-2xl mx-auto shadow border-b my-2">
      <div className="p-8">
        <div className="font-thin text-2xl tracking-wider">
          <h1>AdddEmployee</h1>
        </div>
        <div className="item-center justify-center h-14 w-full my-4">
          <label className="block text-gray-500 text-sm font-" htmlFor="">
            First name:
          </label>
          <input className="h-8 w-72 border mt-2 py-2" type="text" />
          <label className="block text-gray-500 text-sm font-" htmlFor="">
            Last name:
          </label>
          <input className="h-8 w-72 border mt-2 py-2" type="text" />
          <label className="block text-gray-500 text-sm font-" htmlFor="">
            email:
          </label>
          <input className="h-8 w-72 border mt-2 py-2" type="email" />
          <div className="item-center justify-center h-14 w-full my-4">
            <button className="text-white font-semibold bg-green-400 hover:bg-green-700 p-2">
              Save
            </button>
            <button className="text-white font-semibold bg-red-400 hover:bg-red-700 p-2">
              Clear
            </button>
          </div>
        </div>
      </div>
    </div>
  );
}
